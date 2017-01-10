/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package lessons.collecionsgenerics;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;

    Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int score() {
        return score;
    }

    @Override
    public int compareTo(Student another) {
        int lastNameComparison = lastName.compareTo(another.lastName);

        // If last names aren't the same, sort by last name
        if (lastNameComparison != 0) {
            return  lastNameComparison;
        }

        // If last names are the same use the first name to sort
        return firstName.compareTo(another.firstName);
    }
}
