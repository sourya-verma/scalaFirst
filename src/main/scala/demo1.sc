implicit def intToString (n:Double  ):String = n.toString
val a:String = 1.1

def show(implicit str:String)= println(str)
implicit val n = 10
implicit val n = "ddddddddddd"
show



def show (str:String) (implicit a:Int):Unit = {
  println(str+" "+ a)
}
implicit val a = 100
show("saurya")

