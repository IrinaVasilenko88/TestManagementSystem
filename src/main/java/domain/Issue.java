package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Issue {
    private int id;
    private boolean open;
    private String author;
    private LocalDate date;
    private Set<String> label;
    private String projects;
    private String milestones;
    private Set<String> assignee;
}