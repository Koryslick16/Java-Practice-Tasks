package org.example.budgetMgt;

import java.util.List;

public interface BudgetMgt {
    String addBudget(String Name);
    void deleteBudget(int id, String Name, double price);
    List<String> displayBudgetList();
}
