package manager;

import domain.Issue;
import repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;
    private List<Issue> issues = new ArrayList<>();

    public List<Issue> filterByAuthor(Predicate<Issue> author) {
        List<Issue> issues = repository.getAll();
        List<Issue> temp = new ArrayList<>();
        for (Issue issue : issues) {
            if (author.test(issue.getAuthor())) {
                temp.add(issue);
            }
        }
        return temp;
    }

    public Issue filterByLabel(Predicate<Issue> label) {
        for (Issue issue : issues) {
            if (issue.getLabel().equals(label)) {
                return issue;
            }
        }
        return null;
    }

    public Issue filterByAssignee(Predicate<Issue> assignee) {
        for (Issue issue : issues) {
            if (issue.getAssignee().equals(assignee)) {
                return issue;
            }
        }
        return null;
    }
}
