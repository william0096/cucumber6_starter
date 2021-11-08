#language: es
@functionality:E2E.Compras.Online.Camisas
@layer:frontend
@execution:automatic
@automation:complete
Característica: Compra de camisas online
  Yo como Cliente de react shopping cart
  Necesito comprar camisas online
  Para no tener que desplazarme hasta la tienda

  @priority:medium
  @Regression:no
  @id:C0010
  Escenario: filtrar camisas por la talla L
    Dado que Andres comprador frecuente de camisas online
    Cuando he filtre la ropa por talla L
    Entonces he mostrará los estilos de camisetas disponibles

  @priority:high
  @Regression:yes
  @id:C0011
  Escenario: Agregar al carrito las primeras camisas
    Dado que Andres comprador frecuente de camisas online
    Cuando he seleccione los primeros tres productos
    Entonces he tendrá 1 productos por cada artículo en carrito

  @priority:high
  @Regression:yes
  @id:C0012
  Escenario: Modificar la cantidad de camisas
    Dado que Andres comprador frecuente de camisas online
    Cuando he modifique cada uno de sus productos
    Entonces he tendrá 2 productos por cada artículo en carrito

  @priority:high
  @Regression:yes
  @id:C0013
  Escenario: Realizar la compra de los productos adquiridos
    Dado que Andres comprador frecuente de camisas online
    Cuando he finalice la compra de sus productos
    Entonces he mostrará el total que se debe pagar




