/*
 * Team Number: X
 * Jo Student (email: jxs5123@psu.edu; github: jstu)
 * James Gosling (email: jag5789@psu.edu; github: java_guru)
 * Course: IST 261
 * Assignment: TD0X
 */

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {
  private static ShoppingList testShoppingList;
  private static Product product1;
  private static Product product2;

  @BeforeAll
  static void init() {
    Main.printTeamInfo();
  }

  @BeforeEach
  void setUp() {
    testShoppingList = new ShoppingList();
    testShoppingList.setName("My Test List");

    product1 = new Product();
    product1.setName("Bread");
    product1.setPrice(1.23);
    product1.setQuantity(2);
    product1.setUom(UnitOfMeasure.EA);
    testShoppingList.addProduct(product1);

    product2 = new Product();
    product2.setName("Milk");
    product2.setPrice(4.50);
    product2.setQuantity(1);
    product2.setUom(UnitOfMeasure.GAL);
    testShoppingList.addProduct(product2);

  }

  @Test
  void addProduct__create_product_and_add_to_list__product_is_found() {
    Product newProduct = new Product();
    newProduct.setName("Frosted Flakes");
    newProduct.setPrice(3.25);
    newProduct.setQuantity(1);
    newProduct.setUom(UnitOfMeasure.BOX);
    testShoppingList.addProduct(newProduct);

    assertTrue(testShoppingList.containsProduct(newProduct));
  }

  @Test
  void containsProduct__pass_product__finds_product() {
    // TODO 10 - Write appropriate assertion for product1 being in testShoppingList

    // TODO 11 - Write appropriate assertion for product2 being in testShoppingList

  }

  @Test
    // TODO 12 - Give this test method an appropriate name
  void removeProduct__pass_product__unable_to_find_product() {
    testShoppingList.removeProduct(product1);

    // TODO 13 - Write appropriate assertion

  }

  @Test
  void getTotalNetPrice__pass_nothing__returns_correct_total() {
    // TODO 14 - Write this test method: Rushi
    double expected = 6.96;
    assertEquals( expected, testShoppingList.getTotalNetPrice() );

  }

  @Test
  void getProductCount__pass_nothing__returns_correct_count() {
    // TODO 15 - Write appropriate assertion: Rushi
    int expected = 2;
    assertEquals(expected,testShoppingList.getProductCount());

  }

  @Test
  void moveToCart__pass_product__product_is_marked_in_cart() {
    // TODO 16 - Assert that product1 is *not* in the cart: Rushi
    testShoppingList.removeProduct( product1 );
    assertFalse(testShoppingList.containsProduct( product1 ));
    // TODO 17 - Move product1 into the cart: Rushi
    testShoppingList.moveToCart( product1 );

    // TODO 18 - Assert that product1 IS in the cart: Rushi
    assertFalse(testShoppingList.containsProduct( product1 ));
    

  }
}
