package domain

import slick.jdbc.PostgresProfile.api._

import java.sql.Date

class Gamaglobulin(tag: Tag) extends Table[(Int, Date, String, String, Int)](tag, "GAMAGLOBULIN") {
  def * = (id, date, substance, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def substance = column[String]("SUBSTANCE")

  def veterinarian = column[String]("VET")

  def dogId = column[Int]("DOG_ID")

  def dog = foreignKey("gamaglobulin_fk_dog_id", dogId, Dog)(_.id)
}

object Gamaglobulin extends TableQuery(new Gamaglobulin(_)) {}


class Deworming(tag: Tag) extends Table[(Int, Date, String, String, Int)](tag, "DEWORMING") {
  def * = (id, date, substance, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def substance = column[String]("SUBSTANCE")

  def veterinarian = column[String]("VET")

  def dog = foreignKey("deworming_fk_dog_id", dogId, Dog)(_.id)

  def dogId = column[Int]("DOG_ID")
}

object Deworming extends TableQuery(new Deworming(_)) {}


class Parasite(tag: Tag) extends Table[(Int, Date, String, String, Int)](tag, "PARASITE") {
  def * = (id, date, substance, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def substance = column[String]("SUBSTANCE")

  def veterinarian = column[String]("VET")

  def dog = foreignKey("parasite_fk_dog_id", dogId, Dog)(_.id)

  def dogId = column[Int]("DOG_ID")
}

object Parasite extends TableQuery(new Parasite(_)) {}

class Regulation(tag: Tag) extends Table[(Int, Date, String, Date, String, Int)](tag, "REGULATION") {
  def * = (id, date, substance, nextVisit, veterinarian, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def substance = column[String]("SUBSTANCE")

  def nextVisit = column[Date]("NEXT_VISIT_DATE")

  def veterinarian = column[String]("VET")

  def dog = foreignKey("regulation_fk_dog_id", dogId, Dog)(_.id)

  def dogId = column[Int]("DOG_ID")
}

object Regulation extends TableQuery(new Regulation(_)) {}


class Treatment(tag: Tag) extends Table[(Int, Date, String, String, Int)](tag, "Treatment") {
  def * = (id, date, diagnosis, substance, dogId)

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def date = column[Date]("DATE")

  def diagnosis = column[String]("DIAGNOSIS")

  def substance = column[String]("SUBSTANCE")

  def dogId = column[Int]("DOG_ID")

  def dog = foreignKey("treatment_fk_dog_id", dogId, Dog)(_.id)
}

object Treatment extends TableQuery(new Treatment(_)) {}
