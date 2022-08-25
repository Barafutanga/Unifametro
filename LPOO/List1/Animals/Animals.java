package Animals;

public class Animals {
    public String specie, animalclass, name;
    public short weight, calmod;
    public byte age;

    public Animals() {
    }

    public Animals(String name, String specie, String animalclass, short weight, byte age) {
        this.specie = specie;
        this.animalclass = animalclass;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }   

    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public String getAnimalclass() {
        return animalclass;
    }
    public void setAnimalclass(String animalclass) {
        this.animalclass = animalclass;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public short getWeight() {
        return weight;
    }
    public void setWeight(short weight) {
        this.weight = weight;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public short calIntake(byte age) {
        if (animalclass == "mammal") {
            calmod = 2000;
        } else if (animalclass == "bird") {
            calmod = 100;
        } else {
            calmod = 10;
        }
        return calmod;
    }
}