/*
 BillingNG, a next-generation billing solution
 Copyright (C) 2011 Brian Cowdery

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License as
 published by the Free Software Foundation, either version 3 of the
 License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.
 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see http://www.gnu.org/licenses/agpl-3.0.html
 */

package com.billing.ng.plugin.test;

import com.billing.ng.plugin.annotation.Parameter;
import com.billing.ng.plugin.annotation.Plugin;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Test plugin
 *
 * @author Brian Cowdery
 * @since 15/02/11
 */
@Plugin(name = "test plugin")
public class TestPluginImpl implements TestPlugin {

    @NotNull
    @Parameter(name = "string")
    private String string;
    private Integer number;
    private BigDecimal decimal;

    public TestPluginImpl() {
    }

    // annotation at field level
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Min(0) @Max(999)
    @Parameter(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Parameter(name = "decimal", defaultValue = "0.00")
    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}
