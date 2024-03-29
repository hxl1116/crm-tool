package Model;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Customer is the object representation of a customer.
 *
 * @author Henry Larson
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int age;
    private String gender;
    private String profession;

    /**
     * Creates a new <code>Customer</code> object.
     *
     * @param id         the customer unique ID.
     * @param firstName  the customer's first name.
     * @param lastName   the customer's last name.
     * @param address    the customer's address.
     * @param email      the customer's email.
     * @param age        the customer's age.
     * @param gender     the customer's gender.
     * @param profession the customer's profession.
     */
    public Customer(
            int id,
            String firstName,
            String lastName,
            String address,
            String email,
            int age,
            String gender,
            String profession
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAgeAsString() {
        return Integer.toString(age);
    }

    public String getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * Gets a string representation of a <code>Customer</code>
     * <p>
     * Customer ID: <code>id</code>
     * <code>firstName</code>, <code>lastName</code>, <code>age</code>, <code>gender</code>
     * <code>address</code>, <code>email</code>, <code>profession</code>
     *
     * @return the formatted string representation of a <code>Customer</code> object.
     */
    @Override
    public String toString() {
        return String.format("Customer ID: %d\n\t%s, %s, %d, %s\n\t%s, %s, %s",
                id, firstName, lastName, age, gender, address, email, profession);
    }

    public static ModelAndView message(Request req, Response res) {
        Map<String, Object> params = new HashMap<>();
        //params.put("name", req.params(":name"));
        return new ModelAndView(params, "index.ftl");
    }

    public static ModelAndView successMessage(Request req, Response res) {
        Map<String, Object> params = new HashMap<>();
        //params.put("name", req.params(":name"));
        return new ModelAndView(params, "success.ftl");
    }

    public static ModelAndView failureMessage(Request req, Response res) {
        Map<String, Object> params = new HashMap<>();
        //params.put("name", req.params(":name"));
        return new ModelAndView(params, "error.ftl");
    }
}
