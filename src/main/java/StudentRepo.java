import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student findById(String id) throws NoSuchElementException {
        Student student = students.get(id);
        if (student == null) {
            throw new NoSuchElementException("Student with id " + id + " not found");
        }
        return student;
    }
}
