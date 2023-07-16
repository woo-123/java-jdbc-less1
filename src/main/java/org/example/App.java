package org.example;
import java.util.List;
import org.example.core.ConnectionCore;
import org.example.dao.CategoryDao;
import org.example.entity.Category;
import org.example.dao.impl.CategoryDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try {
            CategoryDao categoryDao = new CategoryDaoImpl();
            List<Category> categories = categoryDao.findAll();

            for (Category category: categories) {
                System.out.println("Id: " + category.getId());
                System.out.println("Name: " + category.getName());

            }
        }catch (Exception e){
            System.out.println("Error DB " + e.getMessage());
        }

    }
}
