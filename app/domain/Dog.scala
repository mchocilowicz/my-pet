package domain

import slick.jdbc.PostgresProfile.api._

import java.sql.Date

class Dog(tag: Tag) extends Table[(Int, String, Date, String, String, String, String, Int, String)](tag, "DOG") {
  def * = (id, name, birthDate, gender, species, furr, mark, chipNubmer, image)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("NAME")

  def birthDate = column[Date]("BIRTH_DATE")

  def gender = column[String]("GENDER")

  def species = column[String]("SPECIES")

  def furr = column[String]("FURR")

  def mark = column[String]("MARK")

  def chipNubmer = column[Int]("CHIP_NUMBER")

  def image = column[String]("IMAGE")
}

object Dog extends TableQuery(new Dog(_)) {}