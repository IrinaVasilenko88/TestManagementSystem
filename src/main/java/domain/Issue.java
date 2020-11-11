package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Issue implements Predicate <Issue> {
    private int id;
    private boolean open;
    private String author;
    private int date;
    private Set<String> label = new HashSet<>();
    private String projects;
    private String milestones;
    private Set<String> assignee = new HashSet<>();

    public Issue(int id, boolean open, String author, int date, Set<String> label, String projects, String milestones, Set<String> assignee) {
        this.id = id;
        this.open = open;
        this.author = author;
        this.date = date;
        this.label = label;
        this.projects = projects;
        this.milestones = milestones;
        this.assignee = assignee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Set<String> getLabel() {
        return label;
    }

    public void setLabel(Set<String> label) {
        this.label = label;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getMilestones() {
        return milestones;
    }

    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }

    public Set<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(Set<String> assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean test(Issue issue) {
        return false;
    }

}