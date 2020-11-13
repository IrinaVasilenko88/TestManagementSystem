package ru.netology.crud.manager;

import ru.netology.crud.domain.Issue;
import ru.netology.crud.repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public void add(Issue issue) {
        repository.add(issue);
    }

    public List<Issue> finsAll() {
        return repository.getAll();
    }

    public List<Issue> filterByAuthor(String author) {
        Predicate<Issue> filterByAuthorPredicate = t -> t.getAuthor().equals(author);
        return filterBy(filterByAuthorPredicate);
    }

    public List<Issue> filterByLabel(Set<String> label) {
        Predicate<Issue> filterByLabelPredicate = t -> t.getLabel().equals(label);
        return filterBy(filterByLabelPredicate);
    }

    public List<Issue> filterByAssignee(Set<String> assignee) {
        Predicate<Issue> filterByAssigneePredicate = t -> t.getAssignee().equals(assignee);
        return filterBy(filterByAssigneePredicate);
    }

    public List<Issue> filterBy(Predicate<Issue> issuePredicate) {
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (issuePredicate.test(issue)) {
                temp.add(issue);
            }
        }
        return temp;
    }
}
