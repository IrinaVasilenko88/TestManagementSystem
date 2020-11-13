package repository;

import domain.Issue;
import lombok.Data;

import java.util.*;

@Data
public class IssueRepository {
    private List<Issue> issues = new ArrayList<>();
    ListIterator<Issue> listIterator = issues.listIterator();
    public boolean add(Issue issue) {
        return issues.add(issue);
    }
    public boolean addAll(Collection<? extends Issue> issues){
        return this.issues.addAll(issues);
    }
    public List<Issue> getAll(){
        return issues;
    }
    public Issue getById (int id){
        Issue temp = new Issue();
        for (Issue iter:issues) {
            if (iter.getId()==id){
                temp = iter;
            }
        }
        return temp;
    }
    public void openById(int id){
        for (Issue iter:issues) {
            if (iter.getId()==id){
                iter.setOpen(true);
            }
        }
    }
    public void closeById(int id){
        for (Issue iter:issues) {
            if (iter.getId()==id){
                iter.setOpen(false);
            }
        }
    }
    public boolean remove(Issue issue){
        return this.issues.remove(issue);
    }
    public boolean removeAll(Collection<Issue> issues){
        return this.issues.removeAll(issues);
    }
}




