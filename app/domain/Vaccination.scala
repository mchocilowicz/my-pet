package domain

import slick.jdbc.PostgresProfile.api._

import java.sql.Date

class Vaccination(tag: Tag) extends Table[(Int, Date, String, String, String, Date, Date, String, Int)](tag, "VACCINATION") {
  def * = (id, date, vaccinationType, substance, batchNumber, expirationDate, nextVaccination, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def vaccinationType = column[String]("TYPE")

  def substance = column[String]("SUBSTANCE")

  def batchNumber = column[String]("BATCH_NUMBER")

  def expirationDate = column[Date]("EXPIRATION_DATE")

  def nextVaccination = column[Date]("NEXT_VACCINATION_DATE")

  def veterinarian = column[String]("VET")

  def dog = foreignKey("vaccination_fk_dog_id", dogId, Dog)(_.id)

  def dogId = column[Int]("DOG_ID")
}

object Vaccination extends TableQuery(new Vaccination(_)) {}