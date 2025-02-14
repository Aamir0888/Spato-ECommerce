package com.ibs.spato.responses.my_orders_responses.order_details

data class Shippingaddress(
    val address_type: String,
    val city: String,
    val company: Any,
    val country_id: String,
    val customer_address_id: String,
    val customer_id: Any,
    val email: String,
    val entity_id: String,
    val fax: Any,
    val firstname: String,
    val lastname: String,
    val middlename: Any,
    val parent_id: String,
    val postcode: String,
    val prefix: Any,
    val quote_address_id: String,
    val region: String,
    val region_id: String,
    val street: String,
    val suffix: Any,
    val telephone: String,
    val vat_id: Any,
    val vat_is_valid: Any,
    val vat_request_date: Any,
    val vat_request_id: Any,
    val vat_request_success: Any,
    val vertex_vat_country_code: Any
)