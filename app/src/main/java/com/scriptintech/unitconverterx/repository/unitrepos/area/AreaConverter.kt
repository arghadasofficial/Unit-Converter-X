package com.scriptintech.unitconverterx.repository.unitrepos.area

import com.scriptintech.unitconverterx.components.model.UDropdownModel

interface AreaConverter {
    fun convertArea(fromUnit: String, toUnit: String, value: String): String
    fun getAreaUnits(): List<UDropdownModel>
}