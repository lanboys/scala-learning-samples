package com.bing.lan.obj

/**
 * Created by backend.
 */
object Main {

  def main(args: Array[String]): Unit = {


    val accounts = Accounts
    println(accounts)
    println(accounts.lastNumber)

    Accounts.add()
    Accounts.add()

    println(Accounts.lastNumber)

    val value1: Map[String, Accounts.type] = Map("aaa" -> Accounts, "sss" -> Accounts)

    val value2: Map[String, User.type] = Map("aaa" -> User, "sss" -> User)
  }


}

