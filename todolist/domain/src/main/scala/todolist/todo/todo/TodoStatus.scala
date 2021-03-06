package todolist.todo.todo

sealed trait TodoStatus

object TodoStatus {
  object BackLog extends TodoStatus
  object Doing   extends TodoStatus
  object Done    extends TodoStatus
}
