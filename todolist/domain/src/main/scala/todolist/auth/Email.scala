package todolist.auth

case class Email(value: String) {
  require(value.matches("[^@]+@[^@]+"))
}
