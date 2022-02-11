package ru.netology

import calculateCommission
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionByMastercardAmountForMonthMore75000() {
        val userAmount = 150000
        val userAmountForMonth = 76000
        val cardType = "Mastercard"

        val result = calculateCommission(cardType, userAmountForMonth, userAmount)
        assertEquals(90000.0, result, 0.0)
    }

    @Test
    fun calculateCommissionByMaestroAmountForMonthMore75000() {
        val userAmount = 150000
        val userAmountForMonth = 76000
        val cardType = "Maestro"

        val result = calculateCommission(cardType, userAmountForMonth, userAmount)
        assertEquals(90000.0, result, 0.0)
    }

    @Test
    fun calculateCommissionByMaestroAmountForMonthLess75000() {
        val userAmount = 150000
        val userAmountForMonth = 70000
        val cardType = "Maestro"

        val result = calculateCommission(cardType, userAmountForMonth, userAmount)
        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun calculateCommissionByMastercardAmountForMonthLess75000() {
        val userAmount = 150000
        val userAmountForMonth = 1
        val cardType = "Mastercard"

        val result = calculateCommission(cardType, userAmountForMonth, userAmount)
        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun calculateCommissionWithDefaultSettings() {
        val userAmount = 150000
        val result = calculateCommission(amount = userAmount)
        assertEquals(0.0, result, 0.0)
    }
    @Test
    fun calculateCommissionByVisaCard() {
        val userAmount = 150000
        val cardType = "Visa"

        val result = calculateCommission(cardType, amount = userAmount)
        assertEquals(112500.0, result, 0.0)
    }

    @Test
    fun calculateCommissionByWorldCard() {
        val userAmount = 170000
        val cardType = "Мир"

        val result = calculateCommission(cardType, amount = userAmount)
        assertEquals(127500.0, result, 0.0)
    }
    @Test
    fun calculateCommissionByWorldCardAndDefaultCommission() {
        val userAmount = 5
        val cardType = "Мир"

        val result = calculateCommission(cardType, amount = userAmount)
        assertEquals(3500.0, result, 0.0)
    }
    @Test
    fun calculateCommissionByVisaCardAndDefaultCommission() {
        val userAmount = 5
        val cardType = "Visa"

        val result = calculateCommission(cardType, amount = userAmount)
        assertEquals(3500.0, result, 0.0)
    }
}