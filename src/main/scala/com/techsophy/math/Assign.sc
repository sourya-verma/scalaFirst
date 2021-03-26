
//Q1
def show(f: Int, n: Int) = {
  val list = List.range(1, n+1)
  list.flatMap { num => List.fill(f)(num) }
}
val f = 3
val n = 4
show(f, n)

//Q2--------------------------------------------------------------
// reverse using foldLeft
val list = List(1,2,3,4)

def reverse(list:List[Int]):List[Int] = {
  list.foldLeft(List[Int]()){(acc,ele)=>
    (ele::acc)
  }
}
reverse(list)
// reverse using recursion
def reverse(list:List[Int]):List[Int]= {
  def reverse(list:List[Int], i:Int):List[Int]= {
    if(list.size == i) Nil
    else reverse(list, i+1) :+list(i)
  }
  reverse(list, 0)
}

reverse(List(1,2,3,4,5,6))

//Q4-------------------------------------------------------------------
// Fill using recursion

def fill(ele:Int)(nTime:Int):List[Int] = {
  if(nTime == 1) List[Int](ele)
  else ele :: fill(ele)(nTime-1)
}
val l = fill(6)(5)

//Q5----------------------------------------------------------------
// for removing duplicate
val list = List(1,2,3,4)
def dedupe(list:List[Int]):List[Int] = {
  list.foldLeft(List[Int]()){(acc,ele)=>
    if(!acc.contains(ele))(ele::acc)
    else acc
  }
}

val l = dedupe(list)

println(l)

//Q11--------------------------------------------------------------
def concat(list1:List[Int], list2:List[Int]):List[Int] = {
  list1 ::: list2
}

val l1 = List(1,2,3)
val l2 = List(4,5,6)

concat(l1,l2)

//-------------------------------------------------------------------