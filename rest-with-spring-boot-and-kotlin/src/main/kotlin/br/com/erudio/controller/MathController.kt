package br.com.erudio.controller

import br.com.erudio.converters.NumberConverter
import br.com.erudio.exceptions.BadRequestException
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import kotlin.math.pow
import kotlin.math.sqrt

@RestController
class MathController {
    val counter: AtomicLong = AtomicLong()


    @RequestMapping(value= ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value = "numberOne")numberOne:String?,
            @PathVariable(value = "numberTwo")numberTwo:String?):Double{


        if(NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) throw BadRequestException("Please set a numeric value")
        return NumberConverter.ConverteTwoDouble(numberOne) + NumberConverter.ConverteTwoDouble(numberTwo)
    }

    @RequestMapping(value= ["/sub/{numberOne}/{numberTwo}"])
    fun sub(@PathVariable(value = "numberOne")numberOne:String?,
            @PathVariable(value = "numberTwo")numberTwo:String?):Double{


        if(NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) throw BadRequestException("Please set a numeric value")
        return NumberConverter.ConverteTwoDouble(numberOne) - NumberConverter.ConverteTwoDouble(numberTwo)
    }

    @RequestMapping(value= ["/mult/{numberOne}/{numberTwo}"])
    fun mult(@PathVariable(value = "numberOne")numberOne:String?,
            @PathVariable(value = "numberTwo")numberTwo:String?):Double{


        if(NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) throw BadRequestException("Please set a numeric value")
        return NumberConverter.ConverteTwoDouble(numberOne) * NumberConverter.ConverteTwoDouble(numberTwo)
    }


    @RequestMapping(value= ["/div/{numberOne}/{numberTwo}"])
    fun div(@PathVariable(value = "numberOne")numberOne:String?,
             @PathVariable(value = "numberTwo")numberTwo:String?):Double{


        if(NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) throw BadRequestException("Please set a numeric value")
        return NumberConverter.ConverteTwoDouble(numberOne) / NumberConverter.ConverteTwoDouble(numberTwo)
    }

    @RequestMapping(value= ["/med/{numberOne}/{numberTwo}"])
    fun med(@PathVariable(value = "numberOne")numberOne:String?,
            @PathVariable(value = "numberTwo")numberTwo:String?):Double{


        if(NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) throw BadRequestException("Please set a numeric value")
        return (NumberConverter.ConverteTwoDouble(numberOne) + NumberConverter.ConverteTwoDouble(numberTwo)) / 2
    }
    @RequestMapping(value= ["/raiz/{numberOne}"])
    fun raiz(@PathVariable(value = "numberOne")numberOne:String?): Double{

        if(NumberConverter.isNumeric(numberOne)) throw BadRequestException("Please set a numeric value")
        NumberConverter.ConverteTwoDouble(numberOne)
        return sqrt(NumberConverter.ConverteTwoDouble(numberOne))
    }


}