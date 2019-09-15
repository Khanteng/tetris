package com.example.tetris

class Zblock(x:Int, y:Int):Block(x,y){

    init {
        pB = Ponto(1,0)
        pC = Ponto(1,-1)
        pD = Ponto(2,-1)
    }

    override fun moveDown() {
        pA.moveDown()
        pB.moveDown()
        pC.moveDown()
        pD.moveDown()
    }

    override fun moveGirar() {

    }

    override fun moveLeft() {
        pA.moveLeft()
        pB.moveLeft()
        pC.moveLeft()
        pD.moveLeft()
    }

    override fun moveRight() {
        pA.moveRight()
        pB.moveRight()
        pC.moveRight()
        pD.moveRight()
    }

}
