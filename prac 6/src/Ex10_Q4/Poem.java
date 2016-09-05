package Ex10_Q4;

/**
 * Created by jc299390 on 5/09/16.
 */
public class Poem {
    String name;
    int noOfLines;

    Poem(String name, int noOfLines) {
        this.name = name;
        this.noOfLines = noOfLines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLines() {
        return noOfLines;
    }

    private void setNoOfLines(int noOfLines) {
        this.noOfLines = noOfLines;
    }

    public void display(){
        System.out.println(String.format("%-40s has %5d lines", name, noOfLines));
    }
}

