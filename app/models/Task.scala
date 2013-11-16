package models

import anorm._
import anorm.SqlParser._

import play.api.db._
import play.api.Play.current

case class Task(id: Long, description: String)

object Task {
  def all() : List[Task] = DB.withConnection { implicit connection =>
    SQL("select * from task").as(task *)
  }

  def create(description : String) {
    DB.withConnection { implicit connection =>
      SQL("insert into task (description) values ({description})").on('description -> description).executeUpdate()
    }
  }

  def delete(id : Long) {
    DB.withConnection { implicit connection =>
      SQL("delete from task where id = {id}").on('id -> id).executeUpdate()
    }
  }

  def task = {
    get[Long]("id") ~ get[String]("description") map {
      case id ~ description => Task(id, description)
    }
  }
}