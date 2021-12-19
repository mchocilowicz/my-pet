package domain

import slick.jdbc.PostgresProfile.api._

class Owner(tag: Tag) extends Table[(Int, String, String, String, String, String, Int, Int)](tag, "OWNER") {
  def * = (id, firstname, lastname, street, city, country, phone, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def firstname = column[String]("FIRSTNAME")

  def lastname = column[String]("SURNAME")

  def street = column[String]("STREET")

  def city = column[String]("CITY")

  def country = column[String]("COUNTRY")

  def phone = column[Int]("PHONE")

  def dogId = column[Int]("DOG_ID")

  def dog = foreignKey("onwer_fk_dog_id", dogId, Dog)(_.id)
}

object Owner extends TableQuery(new Owner(_)) {}

class Breeder(tag: Tag) extends Table[(Int, String, String, String, String, String, Int, Int)](tag, "OWNER") {
  def * = (id, firstname, lastname, street, city, country, phone, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def firstname = column[String]("FIRSTNAME")

  def lastname = column[String]("SURNAME")

  def street = column[String]("STREET")

  def city = column[String]("CITY")

  def country = column[String]("COUNTRY")

  def phone = column[Int]("PHONE")

  def dog = foreignKey("breeder_fk_dog_id", dogId, Dog)(_.id)

  def dogId = column[Int]("DOG_ID")
}

object Breeder extends TableQuery(new Breeder(_)) {}
