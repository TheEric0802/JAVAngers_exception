import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
class StudentRepoTest {

    @Test
    void findById_ShouldThrowNoSuchElementException_WhenIdDoesNotExist() {
        StudentRepo repo = new StudentRepo();
        assertThrows(NoSuchElementException.class, () -> repo.findById("123"));
    }
}