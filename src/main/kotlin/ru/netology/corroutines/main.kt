package ru.netology.coroutines

import kotlinx.coroutines.*

import kotlin.coroutines.EmptyCoroutineContext


fun main() /*= runBlocking*/ {
    /*
            Вопросы: Cancellation
            Вопрос №1
            val job = CoroutineScope(EmptyCoroutineContext).launch {
                launch {
                    delay(500)
                    println("ok") // <-- не выполнится из-за job.cancelAndJoin и delay(500). Если убрать delay, то коррутина успела бы отработать.
                }
                launch {
                    delay(500)
                    println("ok")
                }
            }
            delay(100)
            job.cancelAndJoin()



            Вопрос №2
            val job = CoroutineScope(EmptyCoroutineContext).launch {
                val child = launch {
                    delay(500)
                    println("ok") // <-- Не выполнится из-за отмены child.cancel и delay(500).
                }
                launch {
                    delay(500)
                    println("ok")
                }
                delay(100)
                child.cancel()
            }
            delay(100)
            job.join()


            Вопросы: Exception Handling
            Вопрос №1
            with(CoroutineScope(EmptyCoroutineContext)) {
                try {
                    launch {
                        throw Exception("something bad happened")
                    }
                } catch (e: Exception) {
                    e.printStackTrace() // <-- не отработает и выкинет исключение ("В этом коде нет смысла (40 слайд лекции))"

                }
            }
           Thread.sleep(1000)

            Вопрос №2
            CoroutineScope(EmptyCoroutineContext).launch {
                try {
                    coroutineScope {
                        throw Exception("something bad happened")
                    }
                } catch (e: Exception) {
                    e.printStackTrace() // <-- Отработает, так как оберунли в try catch, он исключение выбросится
                }
            }
            Thread.sleep(1000)


            Вопрос №3


            CoroutineScope(EmptyCoroutineContext).launch {
                try {
                    supervisorScope {
                        throw Exception("something bad happened")
                    }
                } catch (e: Exception) {
                    println("111")
                    e.printStackTrace() // <--отработает, функция supervisorScope приостановит выброс исключения до того момента пока не отработает child
                }
            }
            Thread.sleep(1000)

            Вопрос №4

            CoroutineScope(EmptyCoroutineContext).launch {
                try {
                    coroutineScope {
                        launch {
                            delay(500)
                            throw Exception("1.something bad happened") // <-- не успеет отработать из-за задержки, следущая коррутина раньше выкинет ошибку и отменит все дочерние и родительскую корутины.
                        }
                        launch {
                            throw Exception("2.something bad happened")
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            Thread.sleep(1000)

            Вопрос №5
            CoroutineScope(EmptyCoroutineContext).launch {
                try {
                    supervisorScope {
                        launch {
                            delay(500)
                            throw Exception("1 something bad happened") // <-- отработает, так как supervisorScope не отменяет в случае ошибки в одной из дочерних корутин другие
                        }
                        launch {
                            throw Exception("2 something bad happened")
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace() // <--
                }
            }
            Thread.sleep(1000)


            Вопрос №6


        CoroutineScope(EmptyCoroutineContext).launch {
            CoroutineScope(EmptyCoroutineContext).launch {
                launch {
                    delay(1000)
                    println("1 ok") // <-- не отработает, исключение выкинется раньше благодаря delay
                }
                launch {
                    delay(500)
                    println("2 ok")
                }
                throw Exception("something bad happened")
            }
        }
        Thread.sleep(1000)

        Вопрос №7




    CoroutineScope(EmptyCoroutineContext).launch {
        CoroutineScope(EmptyCoroutineContext + SupervisorJob()).launch {
            launch {
                delay(1000)
                println("1 ok") // <-- не отработает, исключение выкинется раньше благодаря delay
            }
            launch {
                delay(500)
                println("2 ok")
            }
            throw Exception("something bad happened")
        }
    }
    Thread.sleep(1000)

*/
}






