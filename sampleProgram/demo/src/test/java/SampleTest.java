
// Sample.javaのgetGeneration関数のテストを行う
// テスト対象はsample.javaのgetGeneration関数

// テスト対象のクラスをインポート
import static org.junit.Assert.assertEquals;
import org.junit.Test;

//　Sampleクラスをインポート
import com.example.Sample;


// テストクラスを宣言
public class SampleTest {

    // テストメソッドを宣言
    @Test
    public void testGetAgeGroup() {
        // テスト対象のメソッドを呼び出し
        assertEquals("0-9 years old", Sample.getAgeGroup(0));
        assertEquals("0-9 years old", Sample.getAgeGroup(9));
        assertEquals("10-19 years old", Sample.getAgeGroup(10));
        assertEquals("10-19 years old", Sample.getAgeGroup(19));
        assertEquals("20-29 years old", Sample.getAgeGroup(20));
        assertEquals("20-29 years old", Sample.getAgeGroup(29));
        assertEquals("30-39 years old", Sample.getAgeGroup(30));
        assertEquals("30-39 years old", Sample.getAgeGroup(39));
        assertEquals("40-49 years old", Sample.getAgeGroup(40));
        assertEquals("40-49 years old", Sample.getAgeGroup(49));
        assertEquals("50-59 years old", Sample.getAgeGroup(50));
        assertEquals("50-59 years old", Sample.getAgeGroup(59));
        assertEquals("60-69 years old", Sample.getAgeGroup(60));
        assertEquals("60-69 years old", Sample.getAgeGroup(69));
        assertEquals("70-79 years old", Sample.getAgeGroup(70));
        assertEquals("70-79 years old", Sample.getAgeGroup(79));
        assertEquals("80-89 years old", Sample.getAgeGroup(80));
        assertEquals("80-89 years old", Sample.getAgeGroup(89));
        assertEquals("90-99 years old", Sample.getAgeGroup(90));
        assertEquals("90-99 years old", Sample.getAgeGroup(99));
        assertEquals("100+ years old", Sample.getAgeGroup(100));
        assertEquals("100+ years old", Sample.getAgeGroup(101));
    }
}