package utest.questions;



    import net.serenitybdd.screenplay.Actor;
    import net.serenitybdd.screenplay.Question;
    import net.serenitybdd.screenplay.questions.Text;
    import utest.model.DataPage;
    import static utest.userinterface.CompleteRegister.COMPLETE_BUTTON;

    import java.util.List;

    public class Answer implements Question<Boolean> {

        List<DataPage> dataPageList;

        public Answer(List<DataPage> dataPageList) {
            this.dataPageList = dataPageList;
        }

        public static Answer toThe(List<DataPage> dataPageList) {
            return new Answer(dataPageList);
        }

        @Override
        public Boolean answeredBy(Actor actor) {
            boolean result;

            String message= Text.of(COMPLETE_BUTTON).viewedBy(actor).asString();
            if (dataPageList.get(0).completeRegister.equals(message)){
                result = true;
            }else{
                result = false;
            }
            return result;
        }
}
