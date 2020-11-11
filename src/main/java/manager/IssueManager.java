package manager;

import domain.Issue;
import repository.IssueRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;
    private Collection<Issue> issues = new ArrayList<>();

    public Issue filterByAuthor(Predicate<Issue> author) {
        for (Issue issue : issues) {
            if (issue.getAuthor().equals(author)) {
                return issue;
            }
        }
        return null;
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
