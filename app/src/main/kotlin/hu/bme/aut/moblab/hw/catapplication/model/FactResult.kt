/**
 * Cat Application API
 * Mobilszoftver laboratórium házi feladat API leírása
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package hu.bme.aut.moblab.hw.catapplication.model


/**
 * 
 * @param id 
 * @param used 
 * @param source 
 * @param type 
 * @param deleted 
 * @param user 
 * @param text 
 * @param updatedAt 
 * @param createdAt 
 * @param status 
 */
data class FactResult (
    val id: String? = null,
    val used: Boolean? = null,
    val source: String? = null,
    val type: String? = null,
    val deleted: Boolean? = null,
    val user: String? = null,
    val text: String? = null,
    val updatedAt: String? = null,
    val createdAt: String? = null,
    val status: FactStatusResult? = null
)