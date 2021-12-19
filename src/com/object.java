package com;
import java.util.Objects;

public abstract class object implements ShowName {
    private String name;
    private mood value;

    public object(String name) {
        this.name = name;
    }

    protected void Join(String name) {

        System.out.println(name + "Арнольд");
    }

    public String getName() {
            return this.name;
    }

    public  object (String name, mood value) {
        this.name = name;
        this.value = value;
    }

    public mood getType() {
        return this.value;
    }
    public String toString() {
        return getName();
    }

    public int Hashcode() {

        return this.name.hashCode();
    }
    public boolean equals(object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() ) return false;
        object object = (object) o;
        return Objects.equals(name, object.name) && value == object.value;
    }
    public int hashcode () {
        return Objects.hash(name, value);
}
    }
