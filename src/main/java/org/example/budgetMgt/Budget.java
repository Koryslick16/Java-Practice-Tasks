package org.example.budgetMgt;

public class Budget {
    private int id;
    private String budgetName;
    private double budgetAmount;

    public Budget(int id, String budgetName, double budgetAmount) {
        this.id = id;
        this.budgetName = budgetName;
        this.budgetAmount = budgetAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    public double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
}
