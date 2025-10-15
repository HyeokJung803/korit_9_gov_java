package com.korit.study.ch03;

public class GameCharacterCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int level = 75;
        int jobCode = 1;
        int equipGrade = 4;
        int skillPoints = 95;

        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier =
                jobCode == 1 ? 1.5 :
                        jobCode == 2 ? 1.2 :
                                jobCode == 3 ? 1.3 :
                                        jobCode == 4 ? 1.1 : 0;

        // 기본 능력치 계산
        int baseStats = (int) (level * jobMultiplier);

        // 장비 보정 계산 (%)
        double equipBonus =
                equipGrade == 5 ? baseStats * 1.0 :
                        equipGrade == 4 ? baseStats * 0.5 :
                                equipGrade == 3 ? baseStats * 0.25 :
                                        equipGrade == 2 ? baseStats * 0.1 :
                                                equipGrade == 1 ? baseStats  * 1.0 : 0.0;

        // 스킬 보너스 계산 (최대 50%)
        double skillBonusCount = (skillPoints / 10) * 5;

        double skillBonus =
                skillBonusCount >= 50 ? baseStats * 0.5 :
                        skillBonusCount == 45 ? baseStats * 0.45 :
                                skillBonusCount == 40 ? baseStats * 0.4 :
                                        skillBonusCount == 35 ? baseStats * 0.35 :
                                                skillBonusCount == 30 ? baseStats * 0.3 :
                                                        skillBonusCount == 25 ? baseStats * 0.25 :
                                                                skillBonusCount == 20 ? baseStats * 0.2 :
                                                                        skillBonusCount == 15 ? baseStats * 0.15 :
                                                                                skillBonusCount == 10 ? baseStats * 0.1 :
                                                                                        skillBonusCount == 5 ? baseStats * 0.05 : 0;

        // 직업 특성 보너스 계산
        double jobSpecialBonus =
                jobCode == 1 && (level >= 50) ? baseStats * 0.2 :
                jobCode == 2 && (skillPoints >= 80) ? baseStats * 0.3 :
                jobCode == 3 && (equipGrade >= 4) ? baseStats * 0.25 :
                jobCode == 4 && (level % 2 != 0) ? baseStats * 0.15 : 1;

        // 최종 능력치 계산
        int finalStats = (int) (baseStats + equipBonus + skillBonus + jobSpecialBonus);

        // 전투력 등급 계산
        String combatRank = finalStats >= 8000 ? "S" :
                finalStats >= 6000 ? "A" :
                        finalStats >= 4000 ? "B" :
                                finalStats >= 2000 ? "C" : "D";

        // 직업명 계산
        String jobName = jobCode == 1 ? "전사" :
                jobCode == 2 ? "마법사" :
                jobCode == 3 ? "궁수" :
                jobCode == 4 ? "도적" : "입력오류";

        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");
        System.out.printf("""
                직업: %s (Lv.%d)
                기본 능력치: %d
                장비 보정: %.0f
                스킬 보너스: %.0f
                직업 특성 보너스: %.0f
                최종 능력치: %d
                전투력 등급: %s
                
                """,jobName , level,
                baseStats , equipBonus,
                skillBonus, jobSpecialBonus,
                finalStats, combatRank);


        // 출력 구현
    }
}
