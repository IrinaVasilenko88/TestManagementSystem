package ru.netology.crud.manager;

import ru.netology.crud.domain.Issue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.crud.repository.IssueRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IssueManagerTest {
    private IssueRepository repository = new IssueRepository();
    private IssueManager issueManager = new IssueManager(repository);
    private Issue issue1 = new Issue(1, true, "Автор1", LocalDate.of(2020, 5, 1),
            new HashSet<>(List.of("Label1")), "Project1", "Milestone1", new HashSet<>(List.of("Assignee1")));
    private Issue issue2 = new Issue(2, true, "Автор1", LocalDate.of(2020, 6, 1),
            new HashSet<>(List.of("Label2")), "Project2", "Milestone2", new HashSet<>(List.of("Assignee3")));
    private Issue issue3 = new Issue(3, true, "Автор3", LocalDate.of(2020, 7, 1),
            new HashSet<>(List.of("Label1")), "Project3", "Milestone3", new HashSet<>(List.of("Assignee3")));

    @BeforeEach
    void setUp() {
        issueManager.add(issue1);
        issueManager.add(issue2);
        issueManager.add(issue3);
    }

    @Test
    void filterByAuthor() {
        List<Issue> expected = Arrays.asList(issue1, issue2);
        List<Issue> actual = issueManager.filterByAuthor("Автор1");
        assertEquals(expected, actual);
    }

    @Test
    void filterByLabel() {
        List<Issue> expected = Arrays.asList(issue1, issue3);
        List<Issue> actual = issueManager.filterByLabel(new HashSet<>(List.of("Label1")));
        assertEquals(expected, actual);
    }

    @Test
    void filterByAssignee() {
        List<Issue> expected = Arrays.asList(issue2, issue3);
        List<Issue> actual = issueManager.filterByAssignee(new HashSet<>(List.of("Assignee3")));
        assertEquals(expected, actual);
    }
}