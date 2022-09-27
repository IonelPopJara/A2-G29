/***************************************************************************************************
 * Group Work Assignment 2 - A2-Group 29
 * File: PokemonUtils.java
 * Members: Ionel Pop, Joel Mattsson, Michal Spano
 * For DIT043: Object Oriented Programming; SEM@GU.
 ***************************************************************************************************/

package assignment2;

import java.lang.Math;

public class PokemonUtils
{
    /* Matrix Representation of the strengths and weaknesses of every specified Pokemon Type */
    public static final float[][] DAMAGE_MULTIPLIER_MATRIX = {
        { 1,    1,      1,      .5f,    2,      1,      1   },
        { 1,    2,      1,      1,      1,      1,      1   },
        { 1,    .5f,    .5f,    1,      .5f,    1,      2   },
        { 2,    .5f,    1,      .5f,    2,      2,      .5f },
        { .5f,  .5f,    1,      .5f,    .5f,    1,      2   },
        { 1,    2,      1,      .5f,    2,      .5f,    .5f },
        { 1,    .5f,    1,      2,      .5f,    1,      .5f }
    }; 
    
    /** Return the correct multiplier for the attack
     * @param attackerType
     * @param targetType
     * @return float
     */
    public static float getEffectiveValue(PokemonTypes attackerType, PokemonTypes targetType)
    {
        return DAMAGE_MULTIPLIER_MATRIX[attackerType.mapValue][targetType.mapValue];
    }

    /** 
     * @param value
     * @param decimalPlaces
     * @return double
     */
    public static double truncateDouble(double value, int decimalPlaces) 
    {
        double powerOfTen = Math.pow(10, decimalPlaces);
        return Math.floor(value * powerOfTen) / powerOfTen;
    }
}