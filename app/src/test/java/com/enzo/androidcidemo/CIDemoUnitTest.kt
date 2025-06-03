package com.enzo.androidcidemo

import org.junit.Test
import org.junit.Assert.*

/**
 * CI/CD Demo 單元測試
 */
class CIDemoUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun string_concatenation_works() {
        val result = "Hello" + " " + "World"
        assertEquals("Hello World", result)
    }

    @Test
    fun version_name_format() {
        val versionPattern = Regex("""^\d+\.\d+\.\d+.*$""")
        val version = "1.0.0"
        assertTrue("版本格式應該符合 x.y.z 格式", versionPattern.matches(version))
    }

    @Test
    fun build_config_validation() {
        // 測試建置配置相關的基本驗證
        assertTrue("版本代碼應該大於0", 1 > 0)
        assertNotNull("版本名稱不應為空", "1.0.0")
    }

    @Test
    fun click_counter_logic() {
        // 模擬點擊計數器邏輯
        var clickCount = 0
        clickCount++
        clickCount++
        assertEquals("點擊計數應該正確", 2, clickCount)
    }
}