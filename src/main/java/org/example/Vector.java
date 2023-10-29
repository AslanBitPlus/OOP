package org.example;

public class Vector {
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return Длина вектора
     */
    public double lengthVector() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * @apiNote Метод вычисляемый скалярное произведение x1*x2 + y1*y2 + z1*z2
     * @param vector2 с которым нужно выполнить скалярное произведение
     * @return Скалярное произведение
     */
    public double scolar(Vector vector2) {
        return (this.x*vector2.x + this.y*vector2.y + this.z*vector2.z);
    }

    /**
     * @apiNote Метод, вычисляющий векторное произведение с другим вектором
     * @param vector2 с которым нужно выполнить векторное произведение
     * @return Новый вектор
     */
    public Vector multivector(Vector vector2) {
        return new Vector(this.y*vector2.z - this.z*vector2.y,
                this.z*vector2.x - this.x*vector2.z,
                this.x*vector2.y - this.y*vector2.x);
    }

    /**
     * @apiNote Метод, вычисляющий косинус угла между вектором
     * @param vector2 с которым нужно найти косинус угла
     * @return Косинус угла между векторами
     */
    public double cosanglebetvectors(Vector vector2) {
        return scolar(vector2) / (lengthVector() * vector2.lengthVector());
    }
}
