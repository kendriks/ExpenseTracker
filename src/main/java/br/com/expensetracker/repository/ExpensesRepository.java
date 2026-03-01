package br.com.expensetracker.repository;


import br.com.expensetracker.model.Expenses;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpensesRepository {
    //caminho do arquivo json
    private static final String FILE_PATH = "expenses.json";
    //serializa e desserializa java <-> json
    private final ObjectMapper objectMapper;

    public  ExpensesRepository() {
        objectMapper = new ObjectMapper();
        //para conversão correta de datas
        objectMapper.registerModule(new JavaTimeModule());
    }

    public List<Expenses> list() {
        try {
            File file = new File(FILE_PATH);

            if (!file.exists()) {
                return new ArrayList<>();
            }

            return objectMapper.readValue(
                    file,
                    new TypeReference<List<Expenses>>() {
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void save(List<Expenses> expenses) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_PATH), expenses);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Expenses expense) {
        List<Expenses> expenses = list();
        expenses.add(expense);
        save(expenses);
    }

    public void remove(Long id) {
        List<Expenses> expenses = list();
        expenses.removeIf(d -> d.getId().equals(id));
        save(expenses);
    }
}