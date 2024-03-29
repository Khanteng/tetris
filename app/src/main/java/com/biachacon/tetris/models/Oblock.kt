package com.biachacon.tetris.models

class Oblock(x:Int, y:Int): Block(x,y){

    init {
        pB = Ponto(x + 1, y)
        pC = Ponto(x, y + 1)
        pD = Ponto(x + 1, y + 1)
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
