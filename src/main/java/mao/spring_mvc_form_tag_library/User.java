package mao.spring_mvc_form_tag_library;

/**
 * Project name(项目名称)：Spring_MVC_form_tag_library
 * Package(包名): mao.spring_mvc_form_tag_library
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/9
 * Time(创建时间)： 14:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class User
{
    private String name;
    private Integer age;
    private Double height;

    /**
     * Instantiates a new User.
     */
    public User()
    {
    }

    /**
     * Instantiates a new User.
     *
     * @param name   the name
     * @param age    the age
     * @param height the height
     */
    public User(String name, Integer age, Double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge()
    {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Integer age)
    {
        this.age = age;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Double getHeight()
    {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(Double height)
    {
        this.height = height;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("age：").append(age).append('\n');
        stringbuilder.append("height：").append(height).append('\n');
        return stringbuilder.toString();
    }
}
