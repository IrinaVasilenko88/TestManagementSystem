package repository;

import domain.Issue;

import java.util.ArrayList;
import java.util.Collection;

public class IssueRepository {
    private Collection<Issue> issues = new ArrayList<>();

    public Collection<Issue> getAll() {
        return issues;
    }
public boolean add (Issue issue) {
        return issues.add(issue);
    }

}


