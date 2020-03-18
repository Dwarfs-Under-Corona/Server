package postgres;

import entity.Dwarf;

public interface DwarfDBUpdater {
    boolean createDwarf(Dwarf dwarf);

    boolean updateDwarf(Dwarf dwarf);

    boolean deleteDwarf(Dwarf dwarf);
}
