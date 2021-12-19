package domain

import slick.jdbc.PostgresProfile.api._

import java.sql.Date

class Allergie(tag: Tag) extends Table[(Int, Date, String, String, Int)](tag, "ALLERGIES") {
  def * = (id, date, substance, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def substance = column[String]("SUBSTANCE")

  def veterinarian = column[String]("VET")

  def dogId = column[Int]("DOG_ID")

  def dog = foreignKey("allergie_fk_dog_id", dogId, Dog)(_.id)
}

object Allergie extends TableQuery(new Allergie(_)) {}