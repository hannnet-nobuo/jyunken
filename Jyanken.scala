
sealed abstract class Judgement
sealed abstract class Hand
final case object Win extends Judgement
final case object Lose extends Judgement
final case object Draw extends Judgement

final case object Gu extends Hand
final case object Choki extends Hand
final case object Pa extends Hand

class Jyanken {
  def poi(hand:Hand):Judgement = {
    var m_hand = scala.util.Random.shuffle(List(Gu,Choki,Pa)).head

    if (hand == Gu) {
      m_hand match {
        case Gu => Draw
        case Choki => Win
        case Pa => Lose
      }
    }else if(hand == Choki) {
      m_hand match {
        case Gu => Lose
        case Choki => Draw
        case Pa => Win
      }
    }else{
      m_hand match {
        case Gu => Win
        case Choki => Lose
        case Pa => Draw
      }
    }
  }
}


