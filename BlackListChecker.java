import java.util.*;

public class BlackListChecker {
    public static final List<String> BLACK_LIST_DEV_OBJECTS = Arrays.asList(
            "DD01L", "DD02L/T/V", "DD03L/T", "DD04L/T", "DD07L", "DD09L", "DD12L", "TDEVC-T", "TFDIR",
            "TFTIT", "ENLFDIR", "TADIR-T", "TRDIR", "TMDIR", "D010TAB", "TAPLT", "SEOCLASS", "D020S/T",
            "TSE05", "DM42S", "T100", "TSTC-T", "TSTCP", "FILEPATH", "PATH", "SYST", "VBMOD", "VBDATA",
            "STXFADM", "STXB", "STXH", "STXL", "TSP01", "TSP02", "TST01/03", "TTXOB/T", "DOKIL", "DOKHL",
            "DOKTL", "NRIV", "TNRO", "LTDX-T", "LTDXD/S", "TCVIEW", "USR02", "USR04/5", "USR10", "UST12",
            "USR12", "USR21", "USR41", "UST04", "DEVACCESS", "USR40", "USOBT", "TSTCA", "TOBJ", "SKA1/T",
            "SKA", "SKB1", "SKM1/T", "SKPF", "AUFK", "AFKO", "AFPO", "BSID", "BSIK", "BSIS", "BSAS", "BSET",
            "VBKPF", "F111G", "AGKO", "GLT0", "REGUH", "REGUP", "REGUT", "CSKA", "CSKB", "CSKU", "CSLA/T",
            "CSKS/T", "CSSK", "CSSL", "COSP", "COEP", "COBK", "COST", "TKA01/2", "KEKO", "KEPH", "KALO",
            "KANZ", "CEPC-T", "CKPH-T", "BTCUEV/D", "BTCSEV/D", "BTCJSTAT", "CCCFLOW", "SDBAC", "VRSX",
            "CVERS", "PAT03", "TPROT", "DBTABLOG", "E070", "E71K", "E070C", "TLOCK", "VARID/T", "TVARV",
            "VARI", "VARIS", "SOFM", "SOOS", "SWWWIHEAD", "CDHDR", "CDPOS", "JCDS", "JSTO", "ARCH_OBJ",
            "SNAP", "TBTCO", "TBTCP", "DDSHPVAL5", "TCURC/T", "TCURR", "TCURX/F/V", "T247", "T015M",
            "TFACD", "TTZZ/D", "THOCI", "T012-T", "T012A/B", "T012C", "T012D", "T012E", "T012K", "T056",
            "T056G", "T056R", "T056S", "T056Z", "T5DCX", "T059A/B", "T059C/D", "T059E/G", "T059F", "T059K",
            "T059P/Z", "T007A/S", "T007B", "T042", "T042A", "T042B", "T042C", "T042D", "T042E", "T042F/H",
            "T042G", "T042I", "T042J", "T042K", "T042N/L", "T042S", "T042V", "T042W", "T042Z", "T008", "T043-T",
            "T043I", "T043K", "T043S-T", "T043U", "T000/1", "T880", "T003-T", "T004", "T077S", "T009", "T014",
            "T010O/P", "T001B", "T002", "T005-T", "T006", "TGSB-T");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to check: ");
        String input = scanner.nextLine();
        if (BLACK_LIST_DEV_OBJECTS.contains(input)) {
            System.out.println(input + " is in the blacklist.");
        } else {
            System.out.println(input + " is NOT in the blacklist.");
        }
        scanner.close();
    }
}