package net.degoes

object workspace {
  //
  // Please join and say hello:
  //
  // CHAT ROOM:  https://gitter.im/jdegoes/functional-scala
  //
  // Please git clone and build:
  //
  // REPOSITORY: https://github.com/jdegoes/functional-design
  //
  // Daily Schedule:
  //
  //    START :
  //    LUNCH :
  //    END   :

  //Product Type
  final case class Person(name: String, age: Int)

  //Sum Type Contains exactly one of
  sealed trait ShippingMethod
  object ShippingMethod {
    object Fedex       extends ShippingMethod
    case object DHL    extends ShippingMethod
    case object Postal extends ShippingMethod
  }

  def t(sm: ShippingMethod): Unit =
    sm match {
      case ShippingMethod.Fedex => println("fedex")
      case _                    => println("other")
    }
}
