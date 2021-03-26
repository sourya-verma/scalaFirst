import scala.::
//val list = List(1,2,34,4,5,6,7,8)
//
//def max(list:List[Int]):Int={
//  list.foldLeft(0) { (acc, ele) =>
////    if(acc < ele) (acc = ele);
//    if(acc < ele) ele
//    else acc
//  }
//}
//max(list)

val list = List(1,2,3)
def reverse(list:List[Int]):List[Int] = {
  val newList = List()
  list.foldLeft(0){(acc,ele)=>
    (ele)
  }
  newList
}
println(reverse(list))