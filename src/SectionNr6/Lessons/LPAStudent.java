package SectionNr6.Lessons;

// Why is the record built to be immutable?
// You want to protect the data from unintended mutations.
// If you want to modify data on your class, you will not be using the record
public record LPAStudent(String id, String name, String dateOfBitrh, String classList) {
}
